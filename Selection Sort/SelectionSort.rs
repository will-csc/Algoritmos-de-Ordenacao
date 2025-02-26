fn main() {
    let mut arr = [2,4,3,5,7,6,0,8,9,10,1];
    println!("Array: {:?}", arr);
    
    selection_sort(&mut arr);
    println!("Array Ordenado: {:?}", arr);
}
fn selection_sort(arr: &mut [usize;11]){
    let mut min: usize;
    let mut _temp: usize;
    let mut _idx: usize = 0;
    
    for i in 0..11{
        min = arr[i];
        for j in i..11{
            if arr[j] < min { min = arr[j]; _idx = j; }
        }
        
        if min != arr[i] { _temp = arr[i]; arr[i] = min; arr[_idx] = _temp}
    }
}