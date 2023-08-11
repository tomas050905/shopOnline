package shoponline;

public class Pantalon extends Producto {
    protected int talles;
    protected String modelo;

    public Pantalon(int talles, String modelo, String desc, double precio, double codigo) {
        super(desc, precio, codigo);
        this.talles = talles;
        this.modelo = modelo;
    }

    public int getTalles() {
        return talles;
    }

    public void setTalles(int talles) {
        this.talles = talles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return super.toString() + ( "Talle: (" + this.talles + ")"); 
    }
    
    @Override
    public double getPrecio() {
        if(this.modelo.equals("Oxford")){
            this.setPrecio(this.precio + (this.precio * 0.15));
        }
        if(this.modelo.equalsIgnoreCase("skinny")){
            this.setPrecio(this.precio + (this.precio * 0.25));
        }
        if(this.modelo.equalsIgnoreCase("recto")){
            this.setPrecio(this.precio - (this.precio * 0.15));
        }
        return this.precio;
    }
}
