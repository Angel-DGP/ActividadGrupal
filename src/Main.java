import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("TecnoLogixGlobal");
        System.out.println("Ingrese el maximo de productos: ");
        int limiteMaximoProducto = input.nextInt();
        System.out.print("\nIngrese el dia de semana\n– 1 = Lunes\n" +
                "– 2 = Martes\n" +
                "– 3 = Miercoles\n" +
                "– 4 = Jueves\n" +
                "– 5 = Viernes\n" +
                "– 6 = S´abado\n" +
                "– 7 = Domingo\n>>>");
        int diaSemana = input.nextInt();
        var nombreProducto = "";
        float precioBase = 0.0f;
        int categoria = 0;
        var nombreCategoria = "";
        int riesgoTecnologico = 0;
        int stockIngresado = 0;

        float iva = 0.12f, ivaAplicado = 0.0f;
        float imc = 0.015f, imcAplicado = 0.0f;
        float irt = 0.037f, irtAplicado = 0.0f;
        float tce = 0.02f, tceAplicado = 0.0f;

        float precioFinalProducto = 0.0f;

        int totalProductosRegistrados = 0;

        float totalIVA = 0.0f;
        float totalIMC = 0.0f;
        float totalIRT = 0.0f;
        float totalTCE = 0.0f;

        float totalVentas = 0.0f;

        int contadorCat1 = 0;
        int contadorCat2 = 0;
        int contadorCat3 = 0;
        int contadorCat4 = 0;

        float mayorPrecioFinal = 0.0f;
        var productoMayorPrecio = "";
        switch (diaSemana) {
            case 1:
                for(int productosIngresados = 0;
                    productosIngresados<=limiteMaximoProducto;
                    productosIngresados++
                ) {
                    System.out.println("Haz seleccionado el dia Lunes");
                    System.out.println("Ingresa el nombre del producto:");
                    do{
                        nombreProducto = input.nextLine();
                    }while(nombreProducto.length()==0);
                    do{
                        System.out.println("Ingresa el precio del producto el formato es (0.0)");
                        precioBase = input.nextFloat();
                    }while(precioBase<=0);
                    do{
                        System.out.println("Ingresa la categoria: \n– 1 = Electronica personal\n" +
                                "– 2 = Componentes de computo\n" +
                                "– 3 = Accesorios (exentos de IVA)\n" +
                                "– 4 = Redes y telecomunicaciones");
                        categoria = input.nextInt();
                        if(categoria==1){nombreCategoria="Electronica personal"; contadorCat1++;}
                        else if(categoria==2){nombreCategoria="Componentes de computo"; contadorCat2++;}
                        else if(categoria==3){nombreCategoria="Accesorios (exentos de IVA)"; contadorCat3++;}
                        else if(categoria==4){nombreCategoria="Redes y telecomunicaciones"; contadorCat4++;}
                    }while(categoria>4 || categoria<1);
                    do{
                        System.out.println("Ingrese el riesgo tecnologico:\n 1 = S´ı\n 0 = No.");
                        riesgoTecnologico= input.nextInt();
                    }while(riesgoTecnologico<0||riesgoTecnologico>1);
                    do{
                        System.out.println("Ingrese el stock (minimo 1)");
                        stockIngresado = input.nextInt();
                    }while(stockIngresado<1);
                    System.out.println("Producto ingresado "+nombreProducto);
                    System.out.println("Precio base: "+precioBase);
                    if(categoria!=3){
                        ivaAplicado = precioBase * iva;
                        System.out.println("Iva aplicado: "+ivaAplicado);
                    }
                    System.out.println("Imc aplicado:"+imcAplicado);
                    if(riesgoTecnologico==1){
                        irtAplicado = precioBase * irt;
                        System.out.println("IRT aplicado: " + irtAplicado);
                    }
                    precioFinalProducto = precioBase + ivaAplicado +imcAplicado + irtAplicado + tceAplicado;
                    System.out.println("Precio Final: "+precioFinalProducto);
                    System.out.println("Categoria: " + nombreCategoria);
                    System.out.println("Stock ingresado: "+stockIngresado);
                }


        case 2:
        for(int productosIngresados = 0;
            productosIngresados<=limiteMaximoProducto;
            productosIngresados++
        ) {
            System.out.println("Haz seleccionado el dia Martes");
            System.out.println("Ingresa el nombre del producto:");
            do{
                nombreProducto = input.nextLine();
            }while(nombreProducto.length()==0);
            do{
                System.out.println("Ingresa el precio del producto el formato es (0.0)");
                precioBase = input.nextFloat();
            }while(precioBase<=0);
            do{
                System.out.println("Ingresa la categoria: \n– 1 = Electronica personal\n" +
                        "– 2 = Componentes de computo\n" +
                        "– 3 = Accesorios (exentos de IVA)\n" +
                        "– 4 = Redes y telecomunicaciones");
                categoria = input.nextInt();
                if(categoria==1){nombreCategoria="Electronica personal";}
                else if(categoria==2){nombreCategoria="Componentes de computo";}
                else if(categoria==3){nombreCategoria="Accesorios (exentos de IVA)";}
                else if(categoria==4){nombreCategoria="Redes y telecomunicaciones";}
            }while(categoria>4 || categoria<1);
            do{
                System.out.println("Ingrese el riesgo tecnologico:\n 1 = S´ı\n 0 = No.");
                riesgoTecnologico= input.nextInt();
            }while(riesgoTecnologico<0||riesgoTecnologico>1);
            do{
                System.out.println("Ingrese el stock (minimo 1)");
                stockIngresado = input.nextInt();
            }while(stockIngresado<1);
            System.out.println("Producto ingresado "+nombreProducto);
            System.out.println("Precio base: "+precioBase);
            if(categoria!=3){
                ivaAplicado = precioBase * iva;
                System.out.println("Iva aplicado: "+ivaAplicado);
            }
            System.out.println("Imc aplicado:"+imcAplicado);
            if(riesgoTecnologico==1){
                irtAplicado = precioBase * irt;
                System.out.println("IRT aplicado: " + irtAplicado);
            }
            precioFinalProducto = precioBase + ivaAplicado +imcAplicado + irtAplicado + tceAplicado;
            System.out.println("Precio Final: "+precioFinalProducto);
            System.out.println("Categoria: " + nombreCategoria);
            System.out.println("Stock ingresado: "+stockIngresado);
        }

            case 3:
                for(int productosIngresados = 0;
                    productosIngresados<=limiteMaximoProducto;
                    productosIngresados++
                ) {
                    System.out.println("Haz seleccionado el dia Miercoles");
                    System.out.println("Ingresa el nombre del producto:");
                    do{
                        nombreProducto = input.nextLine();
                    }while(nombreProducto.length()==0);
                    do{
                        System.out.println("Ingresa el precio del producto el formato es (0.0)");
                        precioBase = input.nextFloat();
                    }while(precioBase<=0);
                    do{
                        System.out.println("Ingresa la categoria: \n– 1 = Electronica personal\n" +
                                "– 2 = Componentes de computo\n" +
                                "– 3 = Accesorios (exentos de IVA)\n" +
                                "– 4 = Redes y telecomunicaciones");
                        categoria = input.nextInt();
                        if(categoria==1){nombreCategoria="Electronica personal";}
                        else if(categoria==2){nombreCategoria="Componentes de computo";}
                        else if(categoria==3){nombreCategoria="Accesorios (exentos de IVA)";}
                        else if(categoria==4){nombreCategoria="Redes y telecomunicaciones";}
                    }while(categoria>4 || categoria<1);
                    do{
                        System.out.println("Ingrese el riesgo tecnologico:\n 1 = S´ı\n 0 = No.");
                        riesgoTecnologico= input.nextInt();
                    }while(riesgoTecnologico<0||riesgoTecnologico>1);
                    do{
                        System.out.println("Ingrese el stock (minimo 1)");
                        stockIngresado = input.nextInt();
                    }while(stockIngresado<1);
                    System.out.println("Producto ingresado "+nombreProducto);
                    System.out.println("Precio base: "+precioBase);
                    if(categoria!=3){
                        ivaAplicado = precioBase * iva;
                        System.out.println("Iva aplicado: "+ivaAplicado);
                    }
                    System.out.println("Imc aplicado:"+imcAplicado);
                    if(riesgoTecnologico==1){
                        irtAplicado = precioBase * irt;
                        System.out.println("IRT aplicado: " + irtAplicado);
                    }
                    precioFinalProducto = precioBase + ivaAplicado +imcAplicado + irtAplicado + tceAplicado;
                    System.out.println("Precio Final: "+precioFinalProducto);
                    System.out.println("Categoria: " + nombreCategoria);
                    System.out.println("Stock ingresado: "+stockIngresado);
                }

            case 4:
                for(int productosIngresados = 0;
                    productosIngresados<=limiteMaximoProducto;
                    productosIngresados++
                ) {
                    System.out.println("Haz seleccionado el dia Jueves");
                    System.out.println("Ingresa el nombre del producto:");
                    do{
                        nombreProducto = input.nextLine();
                    }while(nombreProducto.length()==0);
                    do{
                        System.out.println("Ingresa el precio del producto el formato es (0.0)");
                        precioBase = input.nextFloat();
                    }while(precioBase<=0);
                    do{
                        System.out.println("Ingresa la categoria: \n– 1 = Electronica personal\n" +
                                "– 2 = Componentes de computo\n" +
                                "– 3 = Accesorios (exentos de IVA)\n" +
                                "– 4 = Redes y telecomunicaciones");
                        categoria = input.nextInt();
                        if(categoria==1){nombreCategoria="Electronica personal";}
                        else if(categoria==2){nombreCategoria="Componentes de computo";}
                        else if(categoria==3){nombreCategoria="Accesorios (exentos de IVA)";}
                        else if(categoria==4){nombreCategoria="Redes y telecomunicaciones";}
                    }while(categoria>4 || categoria<1);
                    do{
                        System.out.println("Ingrese el riesgo tecnologico:\n 1 = S´ı\n 0 = No.");
                        riesgoTecnologico= input.nextInt();
                    }while(riesgoTecnologico<0||riesgoTecnologico>1);
                    do{
                        System.out.println("Ingrese el stock (minimo 1)");
                        stockIngresado = input.nextInt();
                    }while(stockIngresado<1);
                    System.out.println("Producto ingresado "+nombreProducto);
                    System.out.println("Precio base: "+precioBase);
                    if(categoria!=3){
                        ivaAplicado = precioBase * iva;
                        System.out.println("Iva aplicado: "+ivaAplicado);
                    }
                    System.out.println("Imc aplicado:"+imcAplicado);
                    if(riesgoTecnologico==1){
                        irtAplicado = precioBase * irt;
                        System.out.println("IRT aplicado: " + irtAplicado);
                    }
                    precioFinalProducto = precioBase + ivaAplicado +imcAplicado + irtAplicado + tceAplicado;
                    System.out.println("Precio Final: "+precioFinalProducto);
                    System.out.println("Categoria: " + nombreCategoria);
                    System.out.println("Stock ingresado: "+stockIngresado);
                }


            case 5:
                for(int productosIngresados = 0;
                    productosIngresados<=limiteMaximoProducto;
                    productosIngresados++
                ) {
                    System.out.println("Haz seleccionado el dia Viernes");
                    System.out.println("Ingresa el nombre del producto:");
                    do{
                        nombreProducto = input.nextLine();
                    }while(nombreProducto.length()==0);
                    do{
                        System.out.println("Ingresa el precio del producto el formato es (0.0)");
                        precioBase = input.nextFloat();
                    }while(precioBase<=0);
                    do{
                        System.out.println("Ingresa la categoria: \n– 1 = Electronica personal\n" +
                                "– 2 = Componentes de computo\n" +
                                "– 3 = Accesorios (exentos de IVA)\n" +
                                "– 4 = Redes y telecomunicaciones");
                        categoria = input.nextInt();
                        if(categoria==1){nombreCategoria="Electronica personal";}
                        else if(categoria==2){nombreCategoria="Componentes de computo";}
                        else if(categoria==3){nombreCategoria="Accesorios (exentos de IVA)";}
                        else if(categoria==4){nombreCategoria="Redes y telecomunicaciones";}
                    }while(categoria>4 || categoria<1);
                    do{
                        System.out.println("Ingrese el riesgo tecnologico:\n 1 = S´ı\n 0 = No.");
                        riesgoTecnologico= input.nextInt();
                    }while(riesgoTecnologico<0||riesgoTecnologico>1);
                    do{
                        System.out.println("Ingrese el stock (minimo 1)");
                        stockIngresado = input.nextInt();
                    }while(stockIngresado<1);
                    System.out.println("Producto ingresado "+nombreProducto);
                    System.out.println("Precio base: "+precioBase);
                    if(categoria!=3){
                        ivaAplicado = precioBase * iva;
                        System.out.println("Iva aplicado: "+ivaAplicado);
                    }
                    System.out.println("Imc aplicado:"+imcAplicado);
                    if(riesgoTecnologico==1){
                        irtAplicado = precioBase * irt;
                        System.out.println("IRT aplicado: " + irtAplicado);
                    }
                    precioFinalProducto = precioBase + ivaAplicado +imcAplicado + irtAplicado + tceAplicado;
                    System.out.println("Precio Final: "+precioFinalProducto);
                    System.out.println("Categoria: " + nombreCategoria);
                    System.out.println("Stock ingresado: "+stockIngresado);
                }


            case 6:
                for(int productosIngresados = 0;
                    productosIngresados<=limiteMaximoProducto;
                    productosIngresados++
                ) {
                    System.out.println("Haz seleccionado el dia Sabado");
                    System.out.println("Ingresa el nombre del producto:");
                    do{
                        nombreProducto = input.nextLine();
                    }while(nombreProducto.length()==0);
                    do{
                        System.out.println("Ingresa el precio del producto el formato es (0.0)");
                        precioBase = input.nextFloat();
                    }while(precioBase<=0);
                    do{
                        System.out.println("Ingresa la categoria: \n– 1 = Electronica personal\n" +
                                "– 2 = Componentes de computo\n" +
                                "– 3 = Accesorios (exentos de IVA)\n" +
                                "– 4 = Redes y telecomunicaciones");
                        categoria = input.nextInt();
                        if(categoria==1){nombreCategoria="Electronica personal";}
                        else if(categoria==2){nombreCategoria="Componentes de computo";}
                        else if(categoria==3){nombreCategoria="Accesorios (exentos de IVA)";}
                        else if(categoria==4){nombreCategoria="Redes y telecomunicaciones";}
                    }while(categoria>4 || categoria<1);
                    do{
                        System.out.println("Ingrese el riesgo tecnologico:\n 1 = S´ı\n 0 = No.");
                        riesgoTecnologico= input.nextInt();
                    }while(riesgoTecnologico<0||riesgoTecnologico>1);
                    do{
                        System.out.println("Ingrese el stock (minimo 1)");
                        stockIngresado = input.nextInt();
                    }while(stockIngresado<1);

                    System.out.println("Producto ingresado "+nombreProducto);
                    System.out.println("Precio base: "+precioBase);
                    if(categoria!=3){
                        ivaAplicado = precioBase * iva;
                        System.out.println("Iva aplicado: "+ivaAplicado);
                    }
                    System.out.println("Imc aplicado:"+imcAplicado);
                    if(riesgoTecnologico==1){
                        irtAplicado = precioBase * irt;
                        System.out.println("IRT aplicado: " + irtAplicado);
                    }
                    tceAplicado = precioBase * tce;
                    System.out.println("TCE aplicado: " + tceAplicado);
                    precioFinalProducto = precioBase + ivaAplicado +imcAplicado + irtAplicado + tceAplicado;
                    System.out.println("Precio Final: "+precioFinalProducto);
                    System.out.println("Categoria: " + nombreCategoria);
                    System.out.println("Stock ingresado: "+stockIngresado);
                }

        }
    }
}