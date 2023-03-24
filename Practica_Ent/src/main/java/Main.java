/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author kirae
 */
class Main { 
 
    private static final int ERROR = 0; 
    private static final int D1 = 11; 
    private static final int D2 = 12; 
    private static final int E1 = 21; 
    private static final int E2 = 22; 
 
    public static void main(String[] args) { 
        Main programa = new Main(); 
        int resultado = programa.categoria("fds394", 32, "+"); 
        System.out.println("El resultado es: " + resultado); 
    } 
 
    public int categoria( 
        String codigoEmpleado, 
        int mesesTrabajado, 
        String directivo) { 
            if (!codigoEmpleado.matches("[a-z0-9]+")) {
                return ERROR;
            }
            if (mesesTrabajado < 0 || mesesTrabajado > 999) {
                return ERROR;
            }
            if (!directivo.equals("+") && !directivo.equals("-")) {
                return ERROR;
            }
            if (directivo.equals("+") && mesesTrabajado >= 12) {
                return D1;
            } else if (directivo.equals("-") && mesesTrabajado >= 12) {
                return E1;
            } else if (directivo.equals("+") && mesesTrabajado < 12) {
                return D2;
            } else if (mesesTrabajado < 12 && directivo.equals("-")) { 
                return E2; 
            }  
    return ERROR;
    }
} 

