import random as r

def randomArray(size: int):
    return [r.randint(0, 100) for _ in range(size)]

def SelectionSort(arr: list):
    size = len(arr)
    for i in range(size):
        _min = i  # Índice do menor elemento
        for j in range(i + 1, size):  # Percorre do próximo índice até o final
            if arr[j] < arr[_min]:  
                _min = j  # Atualiza o índice do menor elemento encontrado
        # Troca os elementos
        arr[i], arr[_min] = arr[_min], arr[i]

# Entrada do usuário
print("Enter a size value")
size = int(input())

arr = randomArray(size)
print(f"Array: {arr}")

SelectionSort(arr)
print(f"Sorted Array: {arr}")

