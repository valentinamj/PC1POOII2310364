package test;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

		        int totalDias = 0;
		        int ventasTotales = 0;

		   try {
		        System.out.print("Para cuentos dias tienes cifras de ventas?: ");
		        totalDias = scanner.nextInt();

		        if (totalDias < 1) {
		         System.out.println("El número de días debe ser mayor o igual a 1.");
		         System.exit(0);
		            }

		        for (int dia = 1; dia <= totalDias; dia++) {
		          int ventasDia = 0;

		         while (ventasDia <= 0) {
		          try {
		               System.out.print("Ingrese las ventas para el día " + dia + ": ");
		               ventasDia = scanner.nextInt();

		         if (ventasDia < 0) {
		          System.out.println("Las ventas no pueden ser negativas.");
		          } else {
		                 ventasTotales += ventasDia;
		          }
		        } catch (java.util.InputMismatchException e) {
		         System.out.println("Ingrese un número válido para las ventas.");
		        scanner.nextLine();
		       }
		         }
		            }

		        System.out.println("Las ventas totales son: " + totalDias + " días son: " + ventasTotales);
		       } catch (java.util.InputMismatchException e) {
		        System.out.println("Disculpe, el numero ingresado es incorrecto. Ingrese un numero mayor o igual a 1.");
		       } finally {
		        scanner.close();
		   }
		}

	}
