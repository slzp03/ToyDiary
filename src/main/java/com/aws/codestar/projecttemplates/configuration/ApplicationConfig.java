package com.aws.codestar.projecttemplates.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

<<<<<<< master
import com.aws.codestar.projecttemplates.controller.EditController;
=======
>>>>>>> ac87e79 ADD Diary Controller
import com.aws.codestar.projecttemplates.controller.IntroduceController;
import com.aws.codestar.projecttemplates.controller.ToyDiaryController;

/**
 * Spring configuration for sample application.
 */
@Configuration
@ComponentScan({ "com.aws.codestar.projecttemplates.configuration" })
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    /**
     * Retrieved from properties file.
     */
    @Value("${ToyDiary.SiteName}")
    private String siteName;

    @Bean
    public ToyDiaryController toyDiary() {
        return new ToyDiaryController(this.siteName);
    }
    @Bean
    public IntroduceController introduce() {
        return new IntroduceController(this.siteName);
    }
<<<<<<< master
    @Bean
    public EditController diary() {
        return new EditController(this.siteName);
    }
=======

>>>>>>> ac87e79 ADD Diary Controller
    /**
     * Required to inject properties using the 'Value' annotation.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
