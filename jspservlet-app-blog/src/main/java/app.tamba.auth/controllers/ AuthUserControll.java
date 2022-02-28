package app.tamba.auth.controllers;

public class AuthUserController {

private final AuthUserBus usersBus;

@Autowired

public AuthUser Controller (AuthUserBus usersBus) {this.usersBus = usersBus;

}

@PostMapping (value={open +"auth-user"})

public Callable<AuthUser>initAuthUser( @Valid @RequestBody InitAuthUserParam initAuthUserParam) {

return () -> usersBus.initAuthUser (initAuthUserParam);

}

@PatchMapping (value = (secure + "auth-user"}} 

public Callable<AuthUser> patchOwn Profile (@Valid @RequestBody Map<String, Object> patchUserParam) {

return () -> usersBus.patchAuthUser Profile (patchUserParam);

}

@PatchMapping(value = (secure + "auth-user/admin-manage/{authUserId}"})

public Callable<AuthUser> adminPatch(

@Valid @PathVariable @Positive (message = "Id must be positive number.")

@Valid @Request Body Map<String, Object> patchUserParam) {

Long authUserId,

return () -> usersBus.adminPatch (authUserId, patchUserParan);
}
}
