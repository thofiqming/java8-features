import extension.Customer;
import extension.CustomerValidatorExtension;
import org.junit.jupiter.api.Test;

public class CustomerValidatorTest {

    @Test
    public void isCustomerValid() {
        Customer customer = new Customer("Thofiq", 24);
        CustomerValidatorExtension.CustomerValidatorResult validatorResult = CustomerValidatorExtension
                .isNameValid()
                .and(CustomerValidatorExtension.isAgeValid())
                .apply(customer);
        if (validatorResult != CustomerValidatorExtension.CustomerValidatorResult.SUCCESS) {
            System.out.println(validatorResult);
            throw new IllegalStateException(String.valueOf(validatorResult));
        }
    }
}
