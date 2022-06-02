public class Persona {
    private String nombre, tel, direccion;
    private int edad;
    
     public Persona(String nombre,int edad, String tel, String direccion){
         this.nombre = nombre;
         this.edad = edad;
         this.tel = tel;
         this.direccion =  direccion;
     }

     @Override
    public String toString(){
         return  "\n"+ "Nombre: "+ nombre + "\n"+ "Edad: " + edad +"\n"+"Tel: "+ tel +"\n"+"Dirección: "+ direccion;
     }
}
