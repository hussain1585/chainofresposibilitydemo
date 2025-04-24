package com.hussi.presentation.rest;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;

public interface IController<I, O> {
    @GetMapping("/decode")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of all users",
                    content = {@Content(mediaType = "application/json"
                            //        ,schema = @Schema(implementation = T)
                    )}),
//            @ApiResponse(responseCode = "400", description = "Bad Request"),
//            @ApiResponse(responseCode = "401", description = "UnAuthorized Request"),
//            @ApiResponse(responseCode = "403", description = "Forbidden Request")
    })
    CompletableFuture<ResponseEntity<O>> decode(@Valid @RequestParam I pan);
}
