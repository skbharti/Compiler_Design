.text

a: .word
b: .word
c: .word
ar: .space 8


main:

li $s6, 2
addi $t0,$s6,0
li $s6, 7
addi $t1,$s6,0
add $t0,$t0,$t1
sw $t0, a
sub $t0, $t0, 50
blez $t0, $zero,@L0

add $t0, $zero, $zero
j @L1

@L0
:
addi $t0, $zero, 1
@L1
:
addi $sp, $sp, -20
sw $ra, 16($sp)
sw $a0, 12($sp)
sw $t0, 8($sp)
sw $t1, 4($sp)
sw $v0, 0($sp)
li $a0, 2
sll $a0, $a0, 2
jal _new_array
lw $t0, 8($sp)
lw $t1, 4($sp)
lw $a0, 12($sp)
move $t2, $v0
lw $v0, 0($sp)
lw $ra, 16($sp)
addi $sp, $sp, 20
beq $t0, $zero, foo
sw $t0, c
sw $t1, b
sw $t2, ar
addi $sp, $sp, -12
sw $ra, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
jal foo
lw $v0, 4($sp)
lw $v1, 0($sp)
lw $ra, 8($sp)
addi $sp, $sp, 12
jr $ra
foo:
addi $sp, $sp, -12
sw $a0, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $v0, 1
mv $a0, $t0
syscall
lw $v0, 4($sp)
lw $v1, 0($sp)
lw $a0, 8($sp)
addi $sp, $sp, 12
jr $ra
sw $t0, a
