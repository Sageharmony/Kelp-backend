// package main.java.com.kelp.kelpbackend;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.config.annotation.web.configuration.builder.AuthenticationManagerBuilder;

// import java.util.List;

// @EnableWebSecurity 
// @EnableGlobalMethodSecurity(
//     securedEnabled = true,
//     jsr250Enabled = true,
//     prePostEnabled = true
// )
// public class SecurityConfig extends WebSecurityConfigureAdaptor{

//     private final UserRepo userRepo;
//     private final JwtTokenFilter jwtTokenFilter;


//     public SecurityConfig(UserRepo userRepo,  JwtTokenFilter jwtTokenFilter) {
//         this.userRepo = userRepo;
//         this.jwtTokenFilter = jwtTokenFilter;
//     }

//     @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//         auth.userDetailsService(username -> userRepo
//             .findByUsername(username)
//             .orElseThrow(
//                 () -> new UsernameNotFoundException(
//                     format("User: %s, not found", username)
//                 )
//             ));
//     }
//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }


//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http = http.cors().and().csrf().disable();

//         http = http
//             .sessionManagement()
//             .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//             .and();

//         http = http
//             .exceptionHandling()
//             .authenticationEntryPoint(
//                 (request, response, ex) -> {
//                     response.sendError(
//                         HttpServletResponse.SC_UNAUTHORIZED,
//                         ex.getMessage()
//                     );
//                 }
//             )
//             .and();

//         // Set permissions on endpoints
//         http.authorizeRequests()
//             // Our public endpoints
//             .antMatchers("/api/public/**").permitAll()
//             .antMatchers(HttpMethod.GET, "/api/locations/**").permitAll()
//             .antMatchers(HttpMethod.POST, "/api/locations/search").permitAll()
//             // Our private endpoints
//             .anyRequest().authenticated();

//         // Add JWT token filter
//         http.addFilterBefore(
//             jwtTokenFilter,
//             UsernamePasswordAuthenticationFilter.class
//         );
//     }

   
//     @Bean
//     public CorsFilter corsFilter() {
//         UrlBasedCorsConfigurationSource source =
//             new UrlBasedCorsConfigurationSource();
//         CorsConfiguration config = new CorsConfiguration();
//         config.setAllowCredentials(true);
//         config.addAllowedOrigin("*");
//         config.addAllowedHeader("*");
//         config.addAllowedMethod("*");
//         source.registerCorsConfiguration("/**", config);
//         return new CorsFilter(source);
//     }

//     @Override @Bean
//     public AuthenticationManager authenticationManagerBean() throws Exception {
//         return super.authenticationManagerBean();
//     }
    
// }
