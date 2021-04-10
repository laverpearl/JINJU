# map이용해서 정수로 숫자 한꺼번에 받기
a,b,c = map(int,input().split())

#나머지연산 %이거! 프린트는 순서대로 썼음
print((a+b)%c)
print((a%c + b%c)%c)
print((a*b)%c)
print((a%c * b%c)%c)