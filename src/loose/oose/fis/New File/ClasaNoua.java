class ClasaNoua{
    private String nume;
    private int numar;
    public static int t = 100;
    public ClasaNoua(String nume, int numar){
        this.nume=nume;
        this.numar=numar;
    }
    public String toString(){
        return "ClasaNoua: "+ this.nume +" " + this.numar;
    }

    public int calculeaza(){
        return t*this.numar;
    }
}