import com.lucas.hr_hub.backend.application.dtos.CreateAddressDTO;
import com.lucas.hr_hub.backend.domain.entities.Address;

public class CreateAddressService {
    Address execute(CreateAddressDTO dto);
}
