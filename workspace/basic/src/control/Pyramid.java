package control;
import java.util.Scanner;
public class Pyramid {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 사용자로부터 줄 수 입력 받기
	        System.out.print("출력할 줄 수를 입력하세요: ");
	        int lines = scanner.nextInt();

	        System.out.println();

	        // 1. 왼쪽 정렬 삼각형
	        System.out.println("1. 왼쪽 정렬 삼각형:");
	        for (int i = 1; i <= lines; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        System.out.println();

	        // 2. 오른쪽 정렬 삼각형
	        System.out.println("2. 오른쪽 정렬 삼각형:");
	        for (int i = 1; i <= lines; i++) {
	            for (int space = 1; space <= lines - i; space++) {
	                System.out.print(" ");
	            }
	            for (int star = 1; star <= i; star++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        System.out.println();

	        // 3. 피라미드 모양
	        System.out.println("3. 피라미드 모양:");
	        for (int i = 1; i <= lines; i++) {
	            for (int space = 1; space <= lines - i; space++) {
	                System.out.print(" ");
	            }
	            for (int star = 1; star <= 2 * i - 1; star++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        System.out.println();

	        // 4. 마름모 모양
	        System.out.println("4. 마름모 모양:");

	        // 윗부분 (피라미드)
	        for (int i = 1; i <= lines; i++) {
	            for (int space = 1; space <= lines - i; space++) {
	                System.out.print(" ");
	            }
	            for (int star = 1; star <= 2 * i - 1; star++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // 아랫부분 (역피라미드)
	        for (int i = lines - 1; i >= 1; i--) {
	            for (int space = 1; space <= lines - i; space++) {
	                System.out.print(" ");
	            }
	            for (int star = 1; star <= 2 * i - 1; star++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	}


