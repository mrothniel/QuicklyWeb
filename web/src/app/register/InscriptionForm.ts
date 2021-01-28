import { User } from '../service/authentication.service';

export class InscriptionForm {
  public user: User;
  
  constructor(user:User) {
       this.user = user;
    
  }

}


