package lk.ijse.gdse71.springboot_deployment.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * --------------------------------------------
 * Author: Zeenathul Ilma
 * GitHub: https://github.com/Seenathul-Ilma
 * Website: https://zeenathulilma.vercel.app/
 * --------------------------------------------
 * Created: 8/7/2025 12:22 PM
 * Project: SpringBoot_Deployment
 * --------------------------------------------
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String contact;
}

