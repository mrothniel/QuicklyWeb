import { AuthenticationService } from './../service/authentication.service';
import { Allergie } from './Allergie';
import { Component, OnInit } from "@angular/core";
import { Validators, FormGroup, FormBuilder, FormControl, FormGroupDirective, NgForm } from '@angular/forms';
import {COMMA, ENTER} from '@angular/cdk/keycodes';
import {MatChipInputEvent} from '@angular/material/chips';
import { ErrorStateMatcher } from '@angular/material';
import { Preference } from './Preferences';
import { Coc_enseignant_dto } from './InscriptionForm';
import { RegisterService } from '../service/register.service';
import { Router } from '@angular/router';

/** Error when the parent is invalid */
class CrossFieldErrorMatcher implements ErrorStateMatcher {
  isErrorState(control: FormControl | null, form: FormGroupDirective | NgForm | null): boolean {
    return control.dirty && form.invalid;
  }
}

@Component({
  selector: "app-register",
  templateUrl: "./register.component.html",
  styleUrls: ["./register.component.scss"]
})

export class RegisterComponent implements OnInit {

  isLinear = false;
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  thirdFormGroup: FormGroup;
  userForm: FormGroup;
  errorMatcher = new CrossFieldErrorMatcher();


  visible = true;
  selectable = true;
  removable = true;
  addOnBlur = true;
  readonly separatorKeysCodes: number[] = [ENTER, COMMA];
  allergies: Allergie[] = [];
  preferences: Preference[] = [];
  error: string | null;
  invalidLogin: boolean;



  constructor(private _formBuilder: FormBuilder,
              private rs: RegisterService,
              private router: Router,
              private ls: AuthenticationService
              ) {}

  ngOnInit() {
    this.firstFormGroup = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });
    this.secondFormGroup = this._formBuilder.group({
      fruitCtrl: ['', Validators.required]
    });
    this.initForm();

  }

  initForm() {
    this.userForm = this._formBuilder.group({
      COC_ENSEIGNANT_nom: '',
      COC_ENSEIGNANT_motdepasse: '',
      COC_ENSEIGNANT_prenom: '',
      COC_ENSEIGNANT_email: ['',
        Validators.required,
        Validators.email
      ],
      verifyPassword: ''
    }, {
      validator: this.passwordValidator
    });
  }


  passwordValidator(form: FormGroup) {
    const condition = form.get('COC_ENSEIGNANT_motdepasse').value !== form.get('verifyPassword').value;

    return condition ? { passwordsDoNotMatch: true} : null;
  }

  // addAllergie(event: MatChipInputEvent): void {
  //   const input = event.input;
  //   const value = event.value;

  //   // Add our fruit
  //   if ((value || '').trim()) {
  //     this.allergies.push({name: value.trim()});
  //   }

  //   // Reset the input value
  //   if (input) {
  //     input.value = '';
  //   }
  // }

  // addPreference(event: MatChipInputEvent): void {
  //   const input = event.input;
  //   const value = event.value;

  //   // Add our fruit
  //   if ((value || '').trim()) {
  //     this.preferences.push({name: value.trim()});
  //   }

  //   // Reset the input value
  //   if (input) {
  //     input.value = '';
  //   }
  // }

  // removeAllergie(allergie: Allergie): void {
  //   const index = this.allergies.indexOf(allergie);

  //   if (index >= 0) {
  //     this.allergies.splice(index, 1);
  //   }
  // }
  // removePreference(preference: Preference): void {
  //   const index = this.preferences.indexOf(preference);

  //   if (index >= 0) {
  //     this.preferences.splice(index, 1);
  //   }
  // }

  valider() {
    const inscription =  new Coc_enseignant_dto(this.userForm.value.COC_ENSEIGNANT_nom, this.userForm.value.COC_ENSEIGNANT_prenom,
    this.userForm.value.COC_ENSEIGNANT_email, this.userForm.value.COC_ENSEIGNANT_motdepasse);
    console.log(inscription);
    this.rs.register(inscription).subscribe(
      data => {
           console.log('utlisateur creer avec succes');

           this.checkLogin(this.userForm.value.COC_ENSEIGNANT_nom, this.userForm.value.COC_ENSEIGNANT_motdepasse);
          // this.checkLogin(this.userForm.value.username , this.userForm.value.username.password);
      },
      error => {
        // this.invalidLogin = true
        this.error = error.message;
       console.log(this.userForm.value.COC_ENSEIGNANT_nom, this.userForm.value.COC_ENSEIGNANT_motdepasse)
      }
    );
  }

  // checkLogin(username,password) {
  //   this.ls.authenticate(username, password).subscribe(() => {
  //     this.router.navigate(['/sondage-details']);
  //   });

  // }

  checkLogin(username,password) {
    (this.ls.authenticate(username, password).subscribe(
      data => {
        this.router.navigate(['./dashboard']);
        this.invalidLogin = false;
      },
      error => {
        this.invalidLogin = true;
        this.error = error.message;

      }
    )
    );

  }

}






