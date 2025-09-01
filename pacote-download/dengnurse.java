import java.util.Scanner;

public class DengueQuestionnaire {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int score = 0;
      
      // Saudação ao usuário
      System.out.println("Bem-vindo ao questionário de diagnóstico provisório de dengue!");
      System.out.println("Por favor, responda as seguintes perguntas com 'sim' ou 'não'.\n");
      
      // Perguntas do questionário
      System.out.print("Você tem febre? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Sua temperatura é de 38 graus Celsius ou superior? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você tem dor de cabeça? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você tem dor atrás dos olhos? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você tem dor muscular ou nas articulações? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você tem náusea ou vômito? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você tem uma erupção cutânea? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você está sentindo fadiga? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você tem perda de apetite? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você tem dor abdominal? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você tem diarreia? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      System.out.print("Você está com dificuldade para respirar? ");
      if (sc.nextLine().equalsIgnoreCase("sim")) score++;
      
      // Determinando a probabilidade de dengue
      String probability = "";
      if (score >= 0 && score <= 2) {
         probability = "Baixa probabilidade de dengue.";
      } else if (score >= 3 && score <= 5) {
         probability = "Moderada probabilidade de dengue.";
      } else if (score >= 6 && score <= 8) {
         probability = "Alta probabilidade de dengue.";
      } else if (score >= 9 && score <= 12) {
         probability = "Muito alta probabilidade de dengue.";
      }
      
      // Exibindo a probabilidade de dengue
      System.out.println("\nSua pontuação é: " + score + ". " + probability);
      System.out.println("Recomendamos que você procure atendimento médico imediatamente se houver suspeita de dengue.");
      
      // Fechando o scanner
      sc.close();
   }
}