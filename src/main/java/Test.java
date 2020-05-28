import com.saeid.config.AppConfig;
import com.saeid.model.Customer;
import com.saeid.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        List<Customer> customers = customerService.findCustomers("saeid");

        for (Customer customer: customers ) {
            System.out.printf(customer.toString());
        }
    }
}
