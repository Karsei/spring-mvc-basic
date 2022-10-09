package kr.pe.karsei.springmvcbasic.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "wegwegewg";

        // 아래로 갈수록 레벨이 높아진다. 레벨은 application.properties 에서 logging.level 로 조절할 수 있다.
        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        // 위와 달리 기본 로그는 레벨별로 지정해줄 수도 없고, 출력 메세지도 빈약하게 나온다.
        // 더불어 네트워크나 파일 등으로도 남길 수 있다.
        System.out.println("name = " + name);

        // 아래와 같은 사용은 로그에서 보이지 않더라도 내부적으로 연산이 일어나기 때문에 지양해야 한다.
        log.trace("trace log = " + name);

        return "ok";
    }
}
