.data

a: .word
b: .word
c: .word
newline: .asciiz "\n"

.text

main:

li $s6, 5
addi $t0,$s6,0
li $s6, 3
addi $t1,$s6,0
add $t2,$t0,$t1
addi $sp, $sp, -12
sw $a0, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $v0, 1
move $a0, $t0
syscall
li $v0, 4
la $a0, newline
syscall
lw $v0, 4($sp)
lw $v1, 0($sp)
lw $a0, 8($sp)
addi $sp, $sp, 12
addi $sp, $sp, -12
sw $a0, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $v0, 1
move $a0, $t1
syscall
li $v0, 4
la $a0, newline
syscall
lw $v0, 4($sp)
lw $v1, 0($sp)
lw $a0, 8($sp)
addi $sp, $sp, 12
addi $sp, $sp, -12
sw $a0, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $v0, 1
move $a0, $t2
syscall
li $v0, 4
la $a0, newline
syscall
lw $v0, 4($sp)
lw $v1, 0($sp)
lw $a0, 8($sp)
addi $sp, $sp, 12
exit:
sw $t0, a
sw $t1, b
sw $t2, c
