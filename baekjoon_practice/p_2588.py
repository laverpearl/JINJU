#처음받은 숫자는 그대로 쓰고, 두번째 숫자는 따로 따로 받아서 형변환해서 계산해줬음
a = int(input())
b,c,d = list(input())

print(a*int(d),a*int(c),a*int(b),a*int(d)+a*int(c)*10+a*int(b)*100)