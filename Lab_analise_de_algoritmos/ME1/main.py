alfabeto = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

def decode(n, str_):
  if n == 27: n = 1

  palavraDecodificada = ''
  
  for letra in str_:
    count = -1
    for letraNoAlfabeto in alfabeto:
      
      count +=1
      
      if letra == letraNoAlfabeto:
        palavraDecodificada += alfabeto[count - n]  
        break
        
  return palavraDecodificada


if __name__ == "__main__":

    total_ = int(input())

    for i in range(0, total_):
        input_ = input().split(" ")
        number = int(input_[0])
        word = input_[1]
        word_d = decode(number, word)
        print(word_d)