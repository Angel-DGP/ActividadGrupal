import java.util.Scanner;

public class Again {
    //
    public static void main (String[] args){
        //Inicializacion de Scanner
        Scanner sc = new Scanner(System.in);

        //Declaracion de variables
        int limiteProductos = 0;
        int diaOperacion = 0;
            //Variables para el ingreso de un producto
            var nombreProducto = "";
            float precioBase = 0.0f;
            int categoria = 0;
            int riesgoTecnologico = 0;
            int stock = 0;
            var nombreCategoria="";
            float precioFinalUnitario=0.0f;
            //Variables para el calculo de impuestos de un solo producto
            float ivaCalculadoUnitario = 0.0f;
            float imcCalculadoUnitario = 0.0f;
            float irtCalculadoUnitario = 0.0f;
            float tceCalculadoUnitario = 0.0f;
            //Variables que poseen los valores de impuestos
            float iva = 0.12f;
            float imc = 0.015f;
            float irt = 0.037f;
            float tce = 0.02f;
        //Variables para el reporte final
        float totalIva = 0.0f;
        float totalImc = 0.0f;
        float totalIrt = 0.0f;
        float totalTce = 0.0f;
        float montoTotal = 0.0f;
        int categoria1 = 0, categoria2 = 0, categoria3 = 0, categoria4 = 0, mayorCategoria=0;
        var nombreMayorCategoria = "";
        float mayorPrecio = 0.0f;
        var mayorPrecioProducto = "";
        //Mensaje de bienvenida
        System.out.println("Bienvenido a TecnoLogix Global");

        //Guardando valor de usuario en variables
        System.out.print("Ingrese el limite de maximo de productos a registar:\n>>>");
        limiteProductos = sc.nextInt();

        //Solicitamos el dia de operacion, dando instrucciones de los valores permitidos a ingresar, en tal caso que no cumpla
        //las intrucciones se le solicita de nuevo mediante un "do while"
        do{
            System.out.print("Ingrese un numero para indicar el dia, tomando en cuenta estas instrucciones:\n" +
                    "– 1 = Lunes " +
                    "– 2 = Martes\n" +
                    "– 3 = Miercoles " +
                    "– 4 = Jueves\n" +
                    "– 5 = Viernes " +
                    "– 6 = Sabado\n" +
                    "– 7 = Domingo\n>>>");
            diaOperacion = sc.nextInt();
        }while(diaOperacion<=0 || diaOperacion>7);
        //For para poder ingresar varios productos sin repetir codigo
        for(int i = 0; i<limiteProductos;i++){
            sc.nextLine();
            System.out.println("Producto Nº " + (i+1));
            System.out.print("Ingrese el nombre del producto:\n>>>");
            nombreProducto = sc.nextLine();
            do{
                System.out.print("Ingrese el precio base (Formato: 0.0):\n>>>");
                precioBase = sc.nextFloat();
            }while(precioBase<=0);
            do{
                System.out.print("Ingrese la categoria siguiendo estas intrucciones: \n– 1 = Electronica personal\n" +
                        "– 2 = Componentes de computo\n" +
                        "– 3 = Accesorios (exentos de IVA)\n" +
                        "– 4 = Redes y telecomunicaciones\n>>>");
                categoria = sc.nextInt();
                //Designamos el nombre de categoria, mediante if's consecutivos...
                if(categoria==1){nombreCategoria="Electronica personal"; categoria1++;}
                else if(categoria==2){nombreCategoria="Componentes de computo"; categoria2++;}
                else if(categoria==3){nombreCategoria="Accesorios (exentos de IVA)"; categoria3++;}
                else if(categoria==4){nombreCategoria="Redes y telecomunicaciones"; categoria4++;}
            }while(categoria<1||categoria>4);
            do{
                System.out.print("Su producto posee riesgo tecnologico? En caso de ser si, ingrese 1 caso contrario ingrese 0\n>>>");
                riesgoTecnologico = sc.nextInt();
            }while(riesgoTecnologico!=0 && riesgoTecnologico!=1);
            do{
                System.out.print("Ingrese el stock (Minimo 1):\n>>>");
                stock = sc.nextInt();
            }while(stock<1);
            //Realizamos los calculos dependiendo las elecciones del usuario e imprimimos en orden
            System.out.println("PRODUCTO Nº" + (i+1) + " " + nombreProducto);
            System.out.printf("PRECIO BASE: %.2f\n", precioBase);
            if(categoria!=3){
                ivaCalculadoUnitario = precioBase * iva;
                System.out.printf("IVA APLICADO: %.2f\n", ivaCalculadoUnitario);
            }
            imcCalculadoUnitario = precioBase * imc;
            System.out.printf("IMC APLICADO: %.2f\n", imcCalculadoUnitario);
            if(riesgoTecnologico==1){
                irtCalculadoUnitario = precioBase * irt;
                System.out.printf("IRT APLICADO: %.2f\n", irtCalculadoUnitario);
            }
            if(diaOperacion==6 || diaOperacion==7){
                tceCalculadoUnitario = precioBase * tce;
                System.out.printf("TCE APLICADO: %.2f\n", tceCalculadoUnitario);
            }
            precioFinalUnitario = precioBase + ivaCalculadoUnitario + imcCalculadoUnitario + irtCalculadoUnitario + tceCalculadoUnitario;
            System.out.printf("PRECIO FINAL: %.2f\n", precioFinalUnitario);
            System.out.println("CATEGORIA: " + nombreCategoria);
            System.out.println("STOCK INGRESADO: " + stock);

            //Secuencia para sacar los valores del reporte final del dia
            totalIva = totalIva + ivaCalculadoUnitario;
            totalImc = totalImc + imcCalculadoUnitario;
            totalIrt = totalIrt + irtCalculadoUnitario;
            totalTce = totalTce + tceCalculadoUnitario;
            montoTotal = montoTotal + precioFinalUnitario;
            if(precioFinalUnitario>mayorPrecio){mayorPrecio = precioFinalUnitario; mayorPrecioProducto = nombreProducto;}
        }
        System.out.println("REPORTE FINAL DEL DIA");
        System.out.printf("TOTAL DE PRODUCTOS REGISTRADOS: %d\n", limiteProductos);
        System.out.printf("TOTAL RECAUDADO EN IVA: %.2f\n", totalIva);
        System.out.printf("TOTAL RECAUDADO EN IMC: %.2f\n", totalImc);
        System.out.printf("TOTAL RECAUDADO EN IRT: %.2f\n", totalIrt);
        System.out.printf("TOTAL RECAUDADO EN TCE: %.2f\n", totalTce);
        System.out.printf("MONTO TOTAL: %.2f\n", montoTotal);
        mayorCategoria = categoria1;
        nombreMayorCategoria = "Electronica personal";
        if(categoria2>mayorCategoria){
            mayorCategoria=categoria2;
            nombreMayorCategoria = "Componentes de computo";}
        else if(categoria3>mayorCategoria){
            mayorCategoria= categoria3;
            nombreMayorCategoria = "Accesorios (exentos de IVA)";
        }else if (categoria4>mayorCategoria){
            mayorCategoria = categoria4;
            nombreMayorCategoria = "Redes y telecomunicaciones";
        }
        System.out.printf("LA MAYOR CATEGORIA ES: %d %s\n", mayorCategoria, nombreMayorCategoria);
        System.out.printf("PRODUCTO CON MAYOR PRECIO: -%s- CON EL PRECIO: -%.2f-", mayorPrecioProducto, mayorPrecio);
    }
}
