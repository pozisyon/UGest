class CoursParProgramme {
    private String idCoursParProgramme;
    private String idCours;
    private String idProgramme;
    public CoursParProgramme(String idCP,String idC, String idP){
        idCoursParProgramme = idCP;
        idCours = idC;
        idProgramme = idP;

    }

    public void setIdCoursParProgramme(String idCP) {
        idCoursParProgramme = idCP;
    }
    public String getIdCoursParProgramme(){
        return idCoursParProgramme;
    }
    public void setIdCours(String idC){
        idCours = idC;
    }
    public String getIdCours(){
        return idCours;
    }

    public void setIdProgramme(String idP){
        idProgramme = idP;

    }
    public String getIdProgramme(){
        return idProgramme;
    }
}
