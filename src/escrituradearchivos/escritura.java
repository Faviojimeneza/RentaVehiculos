package escrituradearchivos;

import java.io.FileWriter;
import java.io.PrintWriter;

public class escritura 

{

    FileWriter fwTxt;
    PrintWriter pwTxt;
    FileWriter csvWr;
    public void ejemploEscrituraTxt() {
        try {
            fwTxt = new FileWriter("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\EscrituradeArchivos\\ejemploTxt.txt");
            pwTxt = new PrintWriter(fwTxt);

            pwTxt.println("Hola curso de Java");
            pwTxt.println("Feliz Inicio de Semana");
            pwTxt.println("4587912");
            pwTxt.println("Institucion Educativa Pascual Bravo");
            pwTxt.println("Junior tu Papá");

        } catch (Exception e) {
            System.err.println("Se presento un error al abrir el archivo" + e);
        } finally {
            System.out.println("Gracias vuelva pronto");

            if (null != fwTxt) {
                try {
                    fwTxt.close();

                } catch (Exception e) {
                }

            }
        }
    }
    
    public void ejemploEscrituraCsv()
    {
        try {
            csvWr = new FileWriter ("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\EscrituradeArchivos\\ejemploCSV.csv");
            csvWr.append("Referencia");
            csvWr.append(";");
            csvWr.append("Nombre");
            csvWr.append(";");
            csvWr.append("Precio");
            csvWr.append(System.lineSeparator());
            csvWr.append("99947841554");
            csvWr.append(";");
            csvWr.append("Acetaminofem");
            csvWr.append(";");
            csvWr.append("1500");
            csvWr.flush();
            
        }
        catch (Exception e){
            System.out.println("Se produjo un problema" + e);
        }
    }

    public void ejemploEscrituraCsv(String nombreArchivo)
            {
                String ruta = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\EscrituradeArchivos\\";
                String nombreCompleto = ruta+nombreArchivo;
        try {
            csvWr = new FileWriter (nombreCompleto);
            csvWr.append("Referencia");
            csvWr.append(";");
            csvWr.append("Nombre");
            csvWr.append(";");
            csvWr.append("Precio");
            csvWr.append(System.lineSeparator());
            csvWr.append("99947841554");
            csvWr.append(";");
            csvWr.append("Acetaminofem");
            csvWr.append(";");
            csvWr.append("1500");
            csvWr.flush();
            
        }
        catch (Exception e){
            System.out.println("Se produjo un problema" + e);
        }
    }
}


