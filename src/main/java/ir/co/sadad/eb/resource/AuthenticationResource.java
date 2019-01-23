package ir.co.sadad.eb.resource;

//@Path("/restclientapi")
public class AuthenticationResource {

//
//
//    @Inject
//    private UserService userService;

    /**
     * POST /authenticate : authenticate the credential.
     * <p>
     * Authenticate the user login and password.
     * </p>
     *
     * @param loginDTO the login details to authenticate
     * @return the Response with status 200 (OK) and with body the new jwt
     * token, or with status 401 (Unauthorized) if the authentication fails
     */
//    @Timed
//    @Operation(summary = "authenticate the credential")
//    @APIResponse(responseCode = "200", description = "OK")
//    @APIResponse(responseCode = "401", description = "Unauthorized")
//    @Path("/authenticate")
//    @POST
//    @Consumes({MediaType.APPLICATION_JSON})
//    public Response login(@Valid LoginDTO loginDTO) {
//        User user;
//        try {
//            user = userService.authenticate(loginDTO);
//            String token = tokenProvider.createToken(
//                    user.getLogin(),
//                    user.getAuthorities().stream().map(Authority::getName).collect(toSet()),
//                    loginDTO.isRememberMe()
//            );
//            return Response.ok()
//                    .header(AUTHORIZATION, BEARER_PREFIX + token)
//                    .build();
//        } catch (AuthenticationException ex) {
//            return Response.status(UNAUTHORIZED)
//                    .header(AuthenticationException.class.getName(), ex.getLocalizedMessage())
//                    .build();
//        }
//    }

}
