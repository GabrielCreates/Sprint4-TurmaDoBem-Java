package br.com.fiap.bo;

import br.com.fiap.dao.DoacaoDao;
import br.com.fiap.entities.Doacao;
import br.com.fiap.exceptions.ErroNegocioException;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class DoacaoBO {

    public DoacaoBO() {}

    public void registrarComValidacao(Doacao d)
            throws SQLException, ClassNotFoundException, ErroNegocioException {

        if (d.getValor() <= 0)
            throw new ErroNegocioException("O valor da doacao deve ser maior que zero.");

        if (!d.getTipo().equalsIgnoreCase("Dinheiro") && !d.getTipo().equalsIgnoreCase("Material"))
            throw new ErroNegocioException("Tipo invalido.");

        if (d.getData() == null || d.getData().isAfter(LocalDate.now()))
            throw new ErroNegocioException("Data invalida.");

        new DoacaoDao().inserir(d);
    }

    public double calcularTotalDoacoes() throws SQLException, ClassNotFoundException {
        double total = 0;
        for (Doacao d : new DoacaoDao().selecionar()) total += d.getValor();
        return total;
    }

    public List<Doacao> listarTodas() throws SQLException, ClassNotFoundException {
        return new DoacaoDao().selecionar();
    }

    public Doacao buscarPorId(int id) throws SQLException, ClassNotFoundException {
        return new DoacaoDao().selecionarPorId(id);
    }

    public void atualizar(Doacao d) throws SQLException, ClassNotFoundException {
        new DoacaoDao().atualizar(d);
    }

    public void deletar(int id) throws SQLException, ClassNotFoundException {
        new DoacaoDao().deletar(id);
    }

    public double calcularTotalPorTipo(String tipo) throws SQLException, ClassNotFoundException {
        double total = 0;
        for (Doacao d : new DoacaoDao().selecionar())
            if (d.getTipo().equalsIgnoreCase(tipo)) total += d.getValor();
        return total;
    }
}