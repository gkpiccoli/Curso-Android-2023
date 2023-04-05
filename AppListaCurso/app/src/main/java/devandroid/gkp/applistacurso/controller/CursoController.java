package devandroid.gkp.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.gkp.applistacurso.model.Curso;

public class CursoController {

    public List listCursos;

    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();
        listCursos.add(new Curso());
    }
}
