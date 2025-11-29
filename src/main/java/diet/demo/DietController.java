package diet.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DietController {

    /**
     * Example endpoint:
     * http://localhost:8080/mealplan?calories=2000&preference=vegetarian
     */
    @GetMapping("/mealplan")
    public Map<String, Object> getMealPlan(
            @RequestParam int calories,
            @RequestParam(required = false, defaultValue = "none") String preference
    ) {
        // Placeholder output (you will replace this with LLM API call)
        Map<String, Object> response = new HashMap<>();
        response.put("calories", calories);
        response.put("preference", preference);

        // Example meal plan
        response.put("breakfast", "Oatmeal with banana");
        response.put("lunch", "Grilled chicken salad");
        response.put("dinner", "Steamed vegetables with tofu");
        response.put("snack", "Mixed nuts");

        return response;
    }
}
