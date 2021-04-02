package ac.kr.smu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

// 어노테이션
@EnableWebMvc //WebMvc 관련 자동 설정
@Configuration // 설정관련 클래스라는 Annotation
@ComponentScan("ac.kr.smu.controller")
public class ServletConfig implements WebMvcConfigurer {
    /*
        뷰 관련 설정
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry){
        WebMvcConfigurer.super.configureViewResolvers(registry);
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
    /*
        정적 리소스 관련 설정
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/vendor/**").addResourceLocations("/resources/vendor/");
        registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
        registry.addResourceHandler("/scss/**").addResourceLocations("/resources/scss/");
        registry.addResourceHandler("/img/**").addResourceLocations("/resources/img/");
        registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
        // webapp 디렉토리를 루트로하여 설정
    }
}
