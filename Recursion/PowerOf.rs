fn main(){
    let b: i16 = 10;
    let p: i16 = 2;
    let result = powerof(b,p);
    
    println!("{}^{} = {}",b,p,result);
}
fn powerof(b: i16, p: i16) -> i16{
    if p == 0 { return 1;}
    
    let t = powerof(b,p/2) * powerof(b,p/2);
    
    if p % 2 == 0{
        return t;
    }
    return t * b;
}