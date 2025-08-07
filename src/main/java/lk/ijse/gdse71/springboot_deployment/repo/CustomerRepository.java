package lk.ijse.gdse71.springboot_deployment.repo;

import lk.ijse.gdse71.springboot_deployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * --------------------------------------------
 * Author: Zeenathul Ilma
 * GitHub: https://github.com/Seenathul-Ilma
 * Website: https://zeenathulilma.vercel.app/
 * --------------------------------------------
 * Created: 8/7/2025 11:47 AM
 * Project: SpringBoot_Deployment
 * --------------------------------------------
 **/


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
