export class Coc_enseignant_dto {
    public COC_ENSEIGNANT_nom: string;
    public COC_ENSEIGNANT_prenom: string;
    public COC_ENSEIGNANT_email: string;
    public COC_ENSEIGNANT_motdepasse: string;

    constructor(user:User) {
           this.user = user;
      }
}
