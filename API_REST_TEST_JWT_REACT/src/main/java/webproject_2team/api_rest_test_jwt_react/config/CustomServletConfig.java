package webproject_2team.api_rest_test_jwt_react.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//작업순서 3
@Configuration
@EnableWebMvc
public class CustomServletConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/files/**") // 요청 경로 매핑 (static 폴더 밑)
                // 접근 예시 : http://localhost:8080/files/sample.html
                .addResourceLocations("classpath:/static/"); // 실제 리소스 위치
    }
}
