package extension;


import java.util.function.Function;

import static extension.CustomerValidatorExtension.CustomerValidatorResult;

public interface CustomerValidatorExtension extends Function<Customer, CustomerValidatorResult> {

    static CustomerValidatorExtension isNameValid() {
        return customer -> customer.getName().length() > 4
                ? CustomerValidatorResult.SUCCESS
                : CustomerValidatorResult.NAME_INVALID;
    }

    static CustomerValidatorExtension isAgeValid() {
        return customer -> customer.getAge() > 20
                ? CustomerValidatorResult.SUCCESS
                : CustomerValidatorResult.AGE_INVALID;
    }

    default CustomerValidatorExtension and(CustomerValidatorExtension other){
        return customer -> {
            CustomerValidatorResult result = this.apply(customer);
            return result.equals(CustomerValidatorResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum CustomerValidatorResult {
        SUCCESS,
        NAME_INVALID,
        AGE_INVALID;
    }
}
