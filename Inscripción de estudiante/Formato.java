public class Formato {
    void elegirCurso(String curso) {
        System.out.println("Curso elegido: " + curso);
        actualizarFormato();
        
        ListaDeCursos tiraDeMaterias = new ListaDeCursos();
        tiraDeMaterias.inscribir();
    }

    private void actualizarFormato() {
        System.out.println("Actualizar formato.");
    }
}