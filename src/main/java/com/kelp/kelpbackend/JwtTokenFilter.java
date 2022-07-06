// package main.java.com.kelp.kelpbackend;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.filter.GenericFilterBean;
// import org.springframework.web.filter.OncePerRequestFilter;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.annotation.Order;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
// import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


// @Component
// public class JwtTokenFilter extends OncePerRequestFilter {

//     private final JwtTokenUtil jwtTokenUtil;
//     private final UserRepo userRepo;

//     public JwtTokenFilter(JwtTokenUtil jwtTokenUtil,
//                           UserRepo userRepo) {
//         this.jwtTokenUtil = jwtTokenUtil;
//         this.userRepo = userRepo;
//     }

//     @Override
//     protected void doFilterInternal(HttpServletRequest request,
//                                     HttpServletResponse response,
//                                     FilterChain chain)
//             throws ServletException, IOException {
//         final String header = request.getHeader(HttpHeaders.AUTHORIZATION);
//         if (isEmpty(header) || !header.startsWith("Bearer ")) {
//             chain.doFilter(request, response);
//             return;
//         }

//         final String token = header.split(" ")[1].trim();
//         if (!jwtTokenUtil.validate(token)) {
//             chain.doFilter(request, response);
//             return;
//         }

//         UserDetails userDetails = userRepo
//             .findByUsername(jwtTokenUtil.getUsername(token))
//             .orElse(null);

//         UsernamePasswordAuthenticationToken
//             authentication = new UsernamePasswordAuthenticationToken(
//                 userDetails, null,
//                 userDetails == null ?
//                     List.of() : userDetails.getAuthorities()
//             );

//         authentication.setDetails(
//             new WebAuthenticationDetailsSource().buildDetails(request)
//         );

//         SecurityContextHolder.getContext().setAuthentication(authentication);
//         chain.doFilter(request, response);
//     }

// }