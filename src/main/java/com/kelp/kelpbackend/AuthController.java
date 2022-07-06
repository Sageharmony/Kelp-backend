// package main.java.com.kelp.kelpbackend;

// import java.util.List;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.CrossOrigin
// ;

// @RequestMapping(path = "/public")
// @RestController 
// public class AuthController {


//     private final AuthenticationManager authenticationManager;
//     private final JwtTokenUtil jwtTokenUtil;
//     private final UserViewMapper userViewMapper;


//     public AuthController(AuthenticationManager authenticationManager, JwtTokenUtil jwtTokenUtil, UserViewMapper userViewMapper) {


//         this.authenticationManager = authenticationManager;
//         this.jwtTokenUtil = jwtTokenUtil;
//         this.userViewMapper = userViewMapper;
//     }


//     @PostMapping("/login")
//     public ResponseEntity<UserView> login(@RequestBody @Valid AuthRequest request) {
//         try {
//             Authentication authenticate = authenticationManager
//                 .authenticate(
//                     new UsernamePasswordAuthenticationToken(
//                         request.getUsername(), request.getPassword()
//                     )
//                 );

//             User user = (User) authenticate.getPrincipal();

//             return ResponseEntity.ok()
//                 .header(
//                     HttpHeaders.AUTHORIZATION,
//                     jwtTokenUtil.generateAccessToken(user)
//                 )
//                 .body(userViewMapper.toUserView(user));
//         } catch (BadCredentialsException ex) {
//             return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//         }
//     }




// }