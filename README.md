

Втора лабораториска вежба по Софтверско инженерство

Јован Димов 196056

![graph](https://user-images.githubusercontent.com/57861981/120239118-e7b3cf00-c25d-11eb-9c77-4288827cd2ab.png)

3.
Цикломатската комплексност е 8. Може да се добие од бројот на ребра = 24 - бројот на јазли = 18 + 2 = 8
Или од бројот на предикатни јазли + 1, односно 7 + 1 = 8

4.Според Multiple Condition
T || T -> T
T || F -> T
F || T -> T
F || F -> F
добиваме дека потребно е да тестираме T || X, F || T, F || F


	
1) if (hr < 0 || hr > 24)
T || X -> (0,0,0) -> се добива runtimeError
F || T -> (24,0,0) -> се добива runtimeError
F || F (20,0,15)

2) if(min < 0 || min > 59)
T || X -> (0,0,0) -> се добива runtimeError
F || T -> (0,60,0) -> се добива runtimeError
F || F  (0,20,0)


T && T -> T 
T && F -> F
F && T -> F
F && F -> F
добиваме дека е потребно да тестираме T && T, T && F, F && X
3) if(sec >= 0 && sec <= 59)
T && T -> (20,20,40)
T && F -> (0,0,60 )-> се добива runtimeError
F && F -> (0,0,-10) -> се добива runtimeError

4)if (hr == 24 && min == 0 && sec == 0)
според табелата за вистинитост потребно е да се тестира TTT,TTF,TFX,FXX
TTT -> (24,0,0)
TTF -> (24,0,-1) -> се добива runtimeError
TFX -> (24,-1,0) -> се добива runtimeError
FXX -> (20,1,1) -> не може да се стигне.


5) 

![slika2](https://user-images.githubusercontent.com/57861981/120239150-f69a8180-c25d-11eb-8a89-5037f67ba576.png)
