package sunny.shop.rpc;

import com.sunny.shop.service.user.api.ProductFeignApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductFeignController implements ProductFeignApi {

    @Override
    public Object list() {
        return null;
    }
}
