package DateManipulation;

import DateManipulation.service.BrazilTaxService;
import DateManipulation.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm", Locale.US);


        System.out.println("Enter com os dados do aluguel: ");
        System.out.println("Modelo do carro");
        String carModel = sc.nextLine();

        System.out.println("Retirada Data com dia e hora: ");
        LocalDateTime dateStart = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.println("Retorno Data com dia e hora: ");
        LocalDateTime dateFinish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(dateStart, dateFinish, new Vehicle(carModel));

        System.out.println("preço por hora: ");
        double pricePerHour = sc.nextDouble();;
        System.out.println("preço por Dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("fatura: ");
        System.out.println("Pafamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagemento total: " + cr.getInvoice().getTotalPayment());

        sc.nextLine();

        sc.close();
    }
}
