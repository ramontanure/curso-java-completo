package model.services;

import java.time.format.DateTimeFormatter;

import domain.entities.Contract;
import domain.entities.Installment;

public class ContractService {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		for(int i = 1; i <= months; i++) {
			double resultInterest = onlinePaymentService.interest(contract.getTotalValue() / months, i);
			double resultPaymentFee = onlinePaymentService.paymentFee(contract.getTotalValue() / months + resultInterest);
			System.out.println(resultPaymentFee);
			contract.getParcelas().add(new Installment(contract.getDate().plusMonths(i), contract.getTotalValue() / months + resultInterest + resultPaymentFee));
		}
	}
}
