public class cour2 {
    public static void main(String[] args) {
        var notesPhysique = new double[] { 12, 13, 14, 15, 9 };
        var sommePhysique = 0.0;
        for (var note : notesPhysique) {
            sommePhysique += note;
        }

        var moyennePhysique = sommePhysique / notesPhysique.length;
        System.out.printf("Somme physique : %.2f\nMoyenne physique : %.2f\n\n", sommePhysique, moyennePhysique);

        var notesHistoire = new double[] { 12, 13, 14, 15, 9, 3, 8, 19 };
        var sommeHistoire = 0.0;
        for (var note : notesHistoire) {
            sommeHistoire += note;
        }
        var moyenneHistoire = sommeHistoire / notesHistoire.length;
        System.out.printf("Somme histoire : %.2f\nMoyenne histoire : %.2f\n\n", sommeHistoire, moyenneHistoire);

        var notesGeometrie = new double[] { 12, 13, 14, 15, 9, 1, 2, 2, 9 };
        var sommeGeometrie = 0.0;
        for (var note : notesGeometrie) {
            sommeGeometrie += note;
        }
        var moyenneGeometrie = sommeGeometrie / notesGeometrie.length;
        System.out.printf("Somme géometrie : %.2f\nMoyenne geometrie : %.2f\n\n", sommeGeometrie, moyenneGeometrie);
    }
}
