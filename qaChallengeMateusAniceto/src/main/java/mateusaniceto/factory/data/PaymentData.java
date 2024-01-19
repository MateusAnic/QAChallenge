package mateusaniceto.factory.data;

import mateusaniceto.dto.PaymentDto;
import mateusaniceto.util.DataFakerGenerator;

public class PaymentData {

    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public PaymentDto cartaComDadosValidos(){
        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setName(dataFakerGenerator.firsNameFaker());
        paymentDto.setNumber(dataFakerGenerator.cardNumberFaker());
        paymentDto.setCvc(dataFakerGenerator.cardCVCFaker());
        paymentDto.setMonth(dataFakerGenerator.monthFaker());
        paymentDto.setYear(dataFakerGenerator.yearFaker());

        return paymentDto;
    }
}
