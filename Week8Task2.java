import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    /**
     * throw.
     *
     * @throws NullPointerException .
     */
    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    /**
     * throw.
     *
     * @throws ArrayIndexOutOfBoundsException .
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * throw.
     *
     * @throws ArithmeticException .
     */
    public void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException();
    }

    /**
     * throw.
     *
     * @throws FileNotFoundException .
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException("Lỗi File Not Found");
    }

    /**
     * throw.
     *
     * @throws IOException .
     */
    public void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }

    /**
     * null pointer test.
     *
     * @return error.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * array index out of bound test.
     *
     * @return error.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * arithmetic test.
     *
     * @return error.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * file not found test.
     *
     * @return error.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException n) {
            return "Lỗi File Not Found";
        }

    }

    /**
     * io test.
     *
     * @return error.
     */
    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (IOException e) {
            return "Lỗi IO";
        }
    }
}
