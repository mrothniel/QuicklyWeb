export class Coc_enseignant_dto {
    public COC_ENSEIGNANT_nom: string;
    public COC_ENSEIGNANT_prenom: string;
    public COC_ENSEIGNANT_email: string;
    public COC_ENSEIGNANT_motdepasse: string;

    constructor(COC_ENSEIGNANT_nom: string, COC_ENSEIGNANT_prenom: string, COC_ENSEIGNANT_email: string,  COC_ENSEIGNANT_motdepasse: string) {
           this.COC_ENSEIGNANT_nom = COC_ENSEIGNANT_nom;
           this.COC_ENSEIGNANT_prenom = COC_ENSEIGNANT_prenom;
           this.COC_ENSEIGNANT_email = COC_ENSEIGNANT_email;
           this.COC_ENSEIGNANT_motdepasse = COC_ENSEIGNANT_motdepasse;
      }
}
