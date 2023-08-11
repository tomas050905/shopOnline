package shoponline;

public class Remera extends Producto {
    protected String talles;

    public Remera(String talle, String desc, double precio, double codigo) {
        super(desc, precio, codigo);
        this.talles = talle;
    }

    public String getTalles() {
        return talles;
    }

    public void setTalles(String talles) {
        this.talles = talles;
    }
    
    @Override
    public String toString(){
        return super.toString() + ( "Talle: (" + this.talles + ")");
    }
    
    @Override
    public double getPrecio() {
        if(this.talles.toUpperCase().equals("S")){
            this.setPrecio(this.precio);
        }
        if(this.talles.toUpperCase().equals("M")){
            this.setPrecio(this.precio + (this.precio * 0.05));
        }
        if(this.talles.toUpperCase().equals("L")){
            this.setPrecio(this.precio + (this.precio * 0.10));
        }
        if(this.talles.toUpperCase().equals("XL")){
            this.setPrecio(this.precio + (this.precio * 0.15));
        }
        
        return this.precio;
    }
}