package com.lawu.eshop.authorization.impl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lawu.framework.web.Result;

/**
 * @author Leach
 * @date 2017/10/11
 */
@FeignClient(value = "cache-srv", path = "loginToken/")
public interface LoginTokenService {

    @RequestMapping(value = "setTokenOneToOne", method = RequestMethod.PUT)
    Result setTokenOneToOne(@RequestParam("userLoginType") Integer userLoginType,
                          @RequestParam("account") String account, 
                          @RequestParam("token") String token, 
                          @RequestParam("expireSeconds") Integer expireSeconds,
                          @RequestParam("tokenClearType") Integer tokenClearType);

    @RequestMapping(value = "setTokenOneToMany", method = RequestMethod.PUT)
    Result setTokenOneToMany(@RequestParam("userLoginType") Integer userLoginType,
                           @RequestParam("account") String account,
                           @RequestParam("token") String token,
                           @RequestParam("expireSeconds") Integer expireSeconds);

    @RequestMapping(value = "getAccount", method = RequestMethod.GET)
    Result<String> getAccount(@RequestParam("userLoginType") Integer userLoginType,
                              @RequestParam("token") String token,
                              @RequestParam("flushExpireAfterOperation") Boolean flushExpireAfterOperation,
                              @RequestParam("expireSeconds") Integer expireSeconds,
                              @RequestParam("singleTokenWithUser") Boolean singleTokenWithUser);

    @RequestMapping(value = "getTokenClearType", method = RequestMethod.GET)
    Result<Integer> getTokenClearType(@RequestParam("userLoginType") Integer userLoginType,
                                @RequestParam("token") String token);

    @RequestMapping(value = "delRelationshipByAccount", method = RequestMethod.DELETE)
    Result delRelationshipByAccount(@RequestParam("userLoginType") Integer userLoginType,
                                  @RequestParam("account") String account,
                                  @RequestParam("expireSeconds") Integer expireSeconds,
                                  @RequestParam("tokenClearType") Integer tokenClearType);

    @RequestMapping(value = "delRelationshipByToken", method = RequestMethod.DELETE)
    Result delRelationshipByToken(@RequestParam("userLoginType") Integer userLoginType,
                                @RequestParam("token") String token,
                                @RequestParam("singleTokenWithUser") Boolean singleTokenWithUser,
                                @RequestParam("expireSeconds") Integer expireSeconds,
                                @RequestParam("tokenClearType") Integer tokenClearType);
}
