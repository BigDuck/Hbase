/*
 * Copyright (c) 2015 - 12 - 30  10 : 24 :44
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package com.wpj.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Name：IndexController
 * Time：2015/12/30 22:24
 * author：WPJ587
 * description：
 **/
@RequestMapping("/web")
@Controller
public class IndexController {
   @RequestMapping("/index")
    public String index() {
       System.out.println("---wpjlovehome@gmail.com----值=" + "操" + "," + "IndexController.index()");
       return "index";
    }
}
