class Solve{
    constructor(list){
        this.list = list;
        this.data = [
            ['0', '0', '0', '0', '0', '0', '0', '0', '0'],
            ['0', '0', '0', '0', '0', '0', '0', '8', '0'],
            ['0', '0', '0', '0', '8', '0', '0', '0', '0'],
            ['0', '0', '0', '0', '0', '0', '0', '0', '0'],
            ['0', '0', '0', '0', '0', '0', '0', '0', '0'],
            ['0', '0', '0', '0', '0', '0', '0', '0', '0'],
            ['0', '0', '0', '0', '0', '0', '0', '0', '0'],
            ['0', '0', '0', '0', '0', '0', '8', '0', '0'],
            ['0', '0', '0', '0', '9', '0', '0', '0', '0'],
        ];
    }

    run(){
        let step = 0;
        for(let i=0; i < 9; i++){
            for(let j=0; j < 9; j++){
                this.data[i][j] = this.list[step];
                step++;
            }
        }
        this.sodokoSolver(this.data);
        step = 0;
        for(let i=0; i < 9; i++){
            for(let j=0; j < 9; j++){
                this.list[step] = this.data[i][j];
                step++;
            }
        }
        return this.list;
    }

    isValid(board, row, col, k) {
        for (let i = 0; i < 9; i++) {
            const m = 3 * Math.floor(row / 3) + Math.floor(i / 3);
            const n = 3 * Math.floor(col / 3) + i % 3;
            if (board[row][i] == k || board[i][col] == k || board[m][n] == k) {
              return false;
            }
        }
        return true;
    }


    sodokoSolver(data) {
        for (let i = 0; i < 9; i++) {
            for (let j = 0; j < 9; j++) {
                if (data[i][j] == 0) {
                    for (let k = 1; k <= 9; k++) {
                        if (this.isValid(data, i, j, k)) {
                            data[i][j] = k;
                            if (this.sodokoSolver(data)) {
                                return true;
                            } else {
                                data[i][j] = 0;
                            }
                        }
                    }
                return false;
                }
            }
        }
        return true;
    }
}