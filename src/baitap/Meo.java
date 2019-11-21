package baitap;

public class Meo {
    private String name;
    private  String mauMat;
    public Meo(){
        setName("No Name");
        setMauMat("No Color");
    }
    public String keu(){
        return  "Meo: " + name + " Mat mau: " + mauMat + " keu: Meo Meo" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMauMat() {
        return mauMat;
    }

    public void setMauMat(String mauMat) {
        this.mauMat = mauMat;
    }

    public static void main(String[] args) {
       Meo meoCon = new Meo();
       meoCon.setName("meo cua quang");
       meoCon.setMauMat("tim");
        System.out.println(meoCon.keu());
        Meo meoSon = new Meo();
        meoSon.setName("Sieu nhan gao");
        meoSon.setMauMat(" mau nau ");
        System.out.println(meoSon.keu());
    }
}
