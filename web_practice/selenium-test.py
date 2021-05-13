# selenium의 webdriver를 가져온다.
from selenium import webdriver
# brew 로 설치된 chromedriver의 path
path = '/usr/local/bin/chromedriver' 
# 크롬 드라이버를 사용
browser = webdriver.Chrome(path)
# 브라우저에 띄우고 싶은 URL 입력. 이 경우 로그인부터 하기 위해 로그인창에 접근한다.
browser.get('https://login.toast.com')
# 로그인 창에서 자동으로 정보를 입력
browser.find_element_by_xpath("//input[@type='text']").send_keys("********")
browser.find_element_by_xpath("//input[@type='password']").send_keys("********")
# 입력된 로그인 정보 제출
browser.find_element_by_xpath("//button[@type='submit']").click()
# 로그인 이후, 확인이 필요한 페이지로 이동
browser.get('https://after-login.toast.com')

# 확인하고 싶은 로직. 여기선 테스트로 refresh 를 0.5에 한번씩 하도록 했다.
import time
max_time = 5
start_time = 0
refresh_time_in_seconds = 0.5
while(start_time < max_time):
    browser.refresh()
    start_time += refresh_time_in_seconds
    time.sleep(refresh_time_in_seconds)

browser.quit()